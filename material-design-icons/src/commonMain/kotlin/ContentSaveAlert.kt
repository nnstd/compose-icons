package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ContentSaveAlert: ImageVector
    get() {
        if (_ContentSaveAlert != null) {
            return _ContentSaveAlert!!
        }
        _ContentSaveAlert = ImageVector.Builder(
            name = "ContentSaveAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                moveTo(10f, 19f)
                curveTo(8.3f, 19f, 7f, 17.7f, 7f, 16f)
                reflectiveCurveTo(8.3f, 13f, 10f, 13f)
                reflectiveCurveTo(13f, 14.3f, 13f, 16f)
                reflectiveCurveTo(11.7f, 19f, 10f, 19f)
                moveTo(15f, 3f)
                horizontalLineTo(3f)
                curveTo(1.9f, 3f, 1f, 3.9f, 1f, 5f)
                verticalLineTo(19f)
                curveTo(1f, 20.1f, 1.9f, 21f, 3f, 21f)
                horizontalLineTo(17f)
                curveTo(18.1f, 21f, 19f, 20.1f, 19f, 19f)
                verticalLineTo(7f)
                lineTo(15f, 3f)
                moveTo(23f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(23f)
                verticalLineTo(13f)
                moveTo(23f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(23f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _ContentSaveAlert!!
    }

@Suppress("ObjectPropertyName")
private var _ContentSaveAlert: ImageVector? = null

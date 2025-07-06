package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ContentSaveOutline: ImageVector
    get() {
        if (_ContentSaveOutline != null) {
            return _ContentSaveOutline!!
        }
        _ContentSaveOutline = ImageVector.Builder(
            name = "ContentSaveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(7f)
                lineTo(17f, 3f)
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(16.17f)
                lineTo(19f, 7.83f)
                verticalLineTo(19f)
                moveTo(12f, 12f)
                curveTo(10.34f, 12f, 9f, 13.34f, 9f, 15f)
                reflectiveCurveTo(10.34f, 18f, 12f, 18f)
                reflectiveCurveTo(15f, 16.66f, 15f, 15f)
                reflectiveCurveTo(13.66f, 12f, 12f, 12f)
                moveTo(6f, 6f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _ContentSaveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ContentSaveOutline: ImageVector? = null

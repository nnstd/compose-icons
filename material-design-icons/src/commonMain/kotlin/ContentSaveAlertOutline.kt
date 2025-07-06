package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ContentSaveAlertOutline: ImageVector
    get() {
        if (_ContentSaveAlertOutline != null) {
            return _ContentSaveAlertOutline!!
        }
        _ContentSaveAlertOutline = ImageVector.Builder(
            name = "ContentSaveAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 3f)
                horizontalLineTo(3f)
                curveTo(1.9f, 3f, 1f, 3.9f, 1f, 5f)
                verticalLineTo(19f)
                curveTo(1f, 20.1f, 1.9f, 21f, 3f, 21f)
                horizontalLineTo(17f)
                curveTo(18.1f, 21f, 19f, 20.1f, 19f, 19f)
                verticalLineTo(7f)
                lineTo(15f, 3f)
                moveTo(17f, 19f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(14.2f)
                lineTo(17f, 7.8f)
                verticalLineTo(19f)
                moveTo(10f, 12f)
                curveTo(8.3f, 12f, 7f, 13.3f, 7f, 15f)
                reflectiveCurveTo(8.3f, 18f, 10f, 18f)
                reflectiveCurveTo(13f, 16.7f, 13f, 15f)
                reflectiveCurveTo(11.7f, 12f, 10f, 12f)
                moveTo(4f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
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

        return _ContentSaveAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ContentSaveAlertOutline: ImageVector? = null

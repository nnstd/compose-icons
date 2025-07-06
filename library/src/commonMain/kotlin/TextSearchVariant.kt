package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TextSearchVariant: ImageVector
    get() {
        if (_TextSearchVariant != null) {
            return _TextSearchVariant!!
        }
        _TextSearchVariant = ImageVector.Builder(
            name = "TextSearchVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                moveTo(9f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                moveTo(18f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(2f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                moveTo(19.31f, 11.5f)
                curveTo(19.75f, 10.82f, 20f, 10f, 20f, 9.11f)
                curveTo(20f, 6.61f, 18f, 4.61f, 15.5f, 4.61f)
                reflectiveCurveTo(11f, 6.61f, 11f, 9.11f)
                reflectiveCurveTo(13f, 13.61f, 15.5f, 13.61f)
                curveTo(16.37f, 13.61f, 17.19f, 13.36f, 17.88f, 12.93f)
                lineTo(21f, 16f)
                lineTo(22.39f, 14.61f)
                lineTo(19.31f, 11.5f)
                moveTo(15.5f, 11.61f)
                curveTo(14.12f, 11.61f, 13f, 10.5f, 13f, 9.11f)
                reflectiveCurveTo(14.12f, 6.61f, 15.5f, 6.61f)
                reflectiveCurveTo(18f, 7.73f, 18f, 9.11f)
                reflectiveCurveTo(16.88f, 11.61f, 15.5f, 11.61f)
                close()
            }
        }.build()

        return _TextSearchVariant!!
    }

@Suppress("ObjectPropertyName")
private var _TextSearchVariant: ImageVector? = null

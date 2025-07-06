package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TagSearchOutline: ImageVector
    get() {
        if (_TagSearchOutline != null) {
            return _TagSearchOutline!!
        }
        _TagSearchOutline = ImageVector.Builder(
            name = "TagSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13f)
                curveTo(22f, 13.53f, 21.79f, 14.04f, 21.41f, 14.41f)
                lineTo(21f, 14.83f)
                curveTo(20.91f, 11.97f, 18.84f, 9.62f, 16.11f, 9.11f)
                lineTo(11f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                lineTo(9.11f, 16.11f)
                curveTo(9.62f, 18.84f, 11.97f, 20.91f, 14.83f, 21f)
                lineTo(14.41f, 21.41f)
                curveTo(14.04f, 21.79f, 13.53f, 22f, 13f, 22f)
                curveTo(12.47f, 22f, 11.97f, 21.79f, 11.59f, 21.42f)
                lineTo(2.59f, 12.42f)
                curveTo(2.21f, 12.04f, 2f, 11.53f, 2f, 11f)
                verticalLineTo(4f)
                curveTo(2f, 2.9f, 2.9f, 2f, 4f, 2f)
                horizontalLineTo(11f)
                curveTo(11.53f, 2f, 12.04f, 2.21f, 12.41f, 2.58f)
                lineTo(21.41f, 11.58f)
                curveTo(21.79f, 11.96f, 22f, 12.47f, 22f, 13f)
                moveTo(5f, 6.5f)
                curveTo(5f, 7.33f, 5.67f, 8f, 6.5f, 8f)
                reflectiveCurveTo(8f, 7.33f, 8f, 6.5f)
                reflectiveCurveTo(7.33f, 5f, 6.5f, 5f)
                reflectiveCurveTo(5f, 5.67f, 5f, 6.5f)
                moveTo(15.11f, 10.61f)
                curveTo(12.61f, 10.61f, 10.61f, 12.61f, 10.61f, 15.11f)
                reflectiveCurveTo(12.61f, 19.61f, 15.11f, 19.61f)
                curveTo(16f, 19.61f, 16.8f, 19.36f, 17.5f, 18.93f)
                lineTo(20.61f, 22f)
                lineTo(22f, 20.61f)
                lineTo(18.92f, 17.5f)
                curveTo(19.36f, 16.82f, 19.61f, 16f, 19.61f, 15.11f)
                curveTo(19.61f, 12.61f, 17.61f, 10.61f, 15.11f, 10.61f)
                moveTo(15.11f, 12.61f)
                curveTo(16.5f, 12.61f, 17.61f, 13.73f, 17.61f, 15.11f)
                reflectiveCurveTo(16.5f, 17.61f, 15.11f, 17.61f)
                reflectiveCurveTo(12.61f, 16.5f, 12.61f, 15.11f)
                reflectiveCurveTo(13.73f, 12.61f, 15.11f, 12.61f)
            }
        }.build()

        return _TagSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TagSearchOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TagSearch: ImageVector
    get() {
        if (_TagSearch != null) {
            return _TagSearch!!
        }
        _TagSearch = ImageVector.Builder(
            name = "TagSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.41f, 11.58f)
                lineTo(12.41f, 2.58f)
                curveTo(12.05f, 2.22f, 11.55f, 2f, 11f, 2f)
                horizontalLineTo(4f)
                curveTo(2.89f, 2f, 2f, 2.89f, 2f, 4f)
                verticalLineTo(11f)
                curveTo(2f, 11.55f, 2.22f, 12.05f, 2.59f, 12.41f)
                lineTo(11.58f, 21.41f)
                curveTo(11.95f, 21.77f, 12.45f, 22f, 13f, 22f)
                reflectiveCurveTo(14.05f, 21.77f, 14.41f, 21.41f)
                lineTo(14.83f, 21f)
                curveTo(11.6f, 20.9f, 9f, 18.26f, 9f, 15f)
                curveTo(9f, 11.69f, 11.69f, 9f, 15f, 9f)
                curveTo(18.26f, 9f, 20.9f, 11.6f, 21f, 14.83f)
                lineTo(21.41f, 14.41f)
                curveTo(21.78f, 14.05f, 22f, 13.55f, 22f, 13f)
                curveTo(22f, 12.44f, 21.77f, 11.94f, 21.41f, 11.58f)
                moveTo(5.5f, 7f)
                curveTo(4.67f, 7f, 4f, 6.33f, 4f, 5.5f)
                reflectiveCurveTo(4.67f, 4f, 5.5f, 4f)
                reflectiveCurveTo(7f, 4.67f, 7f, 5.5f)
                reflectiveCurveTo(6.33f, 7f, 5.5f, 7f)
                moveTo(15.11f, 10.61f)
                curveTo(17.61f, 10.61f, 19.61f, 12.61f, 19.61f, 15.11f)
                curveTo(19.61f, 16f, 19.36f, 16.82f, 18.92f, 17.5f)
                lineTo(22f, 20.61f)
                lineTo(20.61f, 22f)
                lineTo(17.5f, 18.93f)
                curveTo(16.8f, 19.36f, 16f, 19.61f, 15.11f, 19.61f)
                curveTo(12.61f, 19.61f, 10.61f, 17.61f, 10.61f, 15.11f)
                reflectiveCurveTo(12.61f, 10.61f, 15.11f, 10.61f)
                moveTo(15.11f, 12.61f)
                curveTo(13.73f, 12.61f, 12.61f, 13.73f, 12.61f, 15.11f)
                reflectiveCurveTo(13.73f, 17.61f, 15.11f, 17.61f)
                reflectiveCurveTo(17.61f, 16.5f, 17.61f, 15.11f)
                reflectiveCurveTo(16.5f, 12.61f, 15.11f, 12.61f)
            }
        }.build()

        return _TagSearch!!
    }

@Suppress("ObjectPropertyName")
private var _TagSearch: ImageVector? = null

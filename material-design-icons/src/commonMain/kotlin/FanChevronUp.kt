package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FanChevronUp: ImageVector
    get() {
        if (_FanChevronUp != null) {
            return _FanChevronUp!!
        }
        _FanChevronUp = ImageVector.Builder(
            name = "FanChevronUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 19f)
                curveTo(13f, 17.59f, 13.5f, 16.3f, 14.3f, 15.28f)
                curveTo(14.17f, 14.97f, 14.03f, 14.65f, 13.86f, 14.34f)
                curveTo(14.26f, 14f, 14.57f, 13.59f, 14.77f, 13.11f)
                curveTo(15.26f, 13.21f, 15.78f, 13.39f, 16.25f, 13.67f)
                curveTo(17.07f, 13.25f, 18f, 13f, 19f, 13f)
                curveTo(20.05f, 13f, 21.03f, 13.27f, 21.89f, 13.74f)
                curveTo(21.95f, 13.37f, 22f, 12.96f, 22f, 12.5f)
                curveTo(22f, 8.92f, 18.03f, 8.13f, 14.33f, 10.13f)
                curveTo(14f, 9.73f, 13.59f, 9.42f, 13.11f, 9.22f)
                curveTo(13.3f, 8.29f, 13.74f, 7.24f, 14.73f, 6.75f)
                curveTo(17.09f, 5.57f, 17f, 2f, 12.5f, 2f)
                curveTo(8.93f, 2f, 8.14f, 5.96f, 10.13f, 9.65f)
                curveTo(9.72f, 9.97f, 9.4f, 10.39f, 9.21f, 10.87f)
                curveTo(8.28f, 10.68f, 7.23f, 10.25f, 6.73f, 9.26f)
                curveTo(5.56f, 6.89f, 2f, 7f, 2f, 11.5f)
                curveTo(2f, 15.07f, 5.95f, 15.85f, 9.64f, 13.87f)
                curveTo(9.96f, 14.27f, 10.39f, 14.59f, 10.88f, 14.79f)
                curveTo(10.68f, 15.71f, 10.24f, 16.75f, 9.26f, 17.24f)
                curveTo(6.9f, 18.42f, 7f, 22f, 11.5f, 22f)
                curveTo(12.31f, 22f, 13f, 21.78f, 13.5f, 21.41f)
                curveTo(13.19f, 20.67f, 13f, 19.86f, 13f, 19f)
                moveTo(12f, 13f)
                curveTo(11.43f, 13f, 11f, 12.55f, 11f, 12f)
                reflectiveCurveTo(11.43f, 11f, 12f, 11f)
                curveTo(12.54f, 11f, 13f, 11.45f, 13f, 12f)
                reflectiveCurveTo(12.54f, 13f, 12f, 13f)
                moveTo(19f, 17.83f)
                lineTo(15.83f, 21f)
                lineTo(14.41f, 19.59f)
                lineTo(19f, 15f)
                lineTo(23.59f, 19.59f)
                lineTo(22.17f, 21f)
                lineTo(19f, 17.83f)
            }
        }.build()

        return _FanChevronUp!!
    }

@Suppress("ObjectPropertyName")
private var _FanChevronUp: ImageVector? = null

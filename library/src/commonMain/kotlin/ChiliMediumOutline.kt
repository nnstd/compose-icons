package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChiliMediumOutline: ImageVector
    get() {
        if (_ChiliMediumOutline != null) {
            return _ChiliMediumOutline!!
        }
        _ChiliMediumOutline = ImageVector.Builder(
            name = "ChiliMediumOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.43f, 7.32f)
                lineTo(6.86f, 6.42f)
                curveTo(7.38f, 5.6f, 8.11f, 5f, 8.94f, 4.7f)
                curveTo(8.81f, 4.3f, 8.45f, 4f, 8f, 4f)
                verticalLineTo(2f)
                curveTo(8.77f, 2f, 9.47f, 2.29f, 10f, 2.77f)
                verticalLineTo(4f)
                curveTo(10.45f, 4f, 10.81f, 4.3f, 10.94f, 4.7f)
                curveTo(9.83f, 5.08f, 8.93f, 6.05f, 8.43f, 7.32f)
                moveTo(8f, 11f)
                curveTo(8f, 10.23f, 8.23f, 9.5f, 8.6f, 8.91f)
                lineTo(7.26f, 8.15f)
                curveTo(6.5f, 8.44f, 6f, 9.16f, 6f, 10f)
                verticalLineTo(11f)
                curveTo(6f, 18.05f, 10.9f, 20.8f, 13.03f, 21.66f)
                curveTo(10.41f, 19.62f, 8f, 16.2f, 8f, 11f)
                moveTo(18f, 10f)
                verticalLineTo(22f)
                curveTo(18f, 22f, 10f, 20f, 10f, 11f)
                verticalLineTo(10f)
                curveTo(10f, 9.27f, 10.4f, 8.63f, 11f, 8.28f)
                lineTo(12.25f, 9f)
                lineTo(14f, 8f)
                lineTo(15.75f, 9f)
                lineTo(17f, 8.28f)
                curveTo(17.6f, 8.63f, 18f, 9.27f, 18f, 10f)
                moveTo(16f, 18.87f)
                verticalLineTo(11.45f)
                lineTo(14f, 10.3f)
                lineTo(12f, 11.43f)
                curveTo(12.17f, 15.44f, 14.23f, 17.69f, 16f, 18.87f)
                moveTo(10.73f, 6.63f)
                lineTo(12.25f, 7.5f)
                lineTo(14f, 6.5f)
                lineTo(15.75f, 7.5f)
                lineTo(17.27f, 6.63f)
                curveTo(16.72f, 5.66f, 15.91f, 4.94f, 14.97f, 4.65f)
                curveTo(14.79f, 3.16f, 13.54f, 2f, 12f, 2f)
                verticalLineTo(4f)
                curveTo(12.44f, 4f, 12.8f, 4.29f, 12.94f, 4.69f)
                curveTo(12.03f, 5f, 11.26f, 5.7f, 10.73f, 6.63f)
                close()
            }
        }.build()

        return _ChiliMediumOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ChiliMediumOutline: ImageVector? = null

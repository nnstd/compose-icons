package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandOkay: ImageVector
    get() {
        if (_HandOkay != null) {
            return _HandOkay!!
        }
        _HandOkay = ImageVector.Builder(
            name = "HandOkay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.3f, 19.26f)
                lineTo(18.96f, 13.61f)
                lineTo(21.08f, 15.73f)
                lineTo(15.42f, 21.38f)
                lineTo(13.3f, 19.26f)
                moveTo(16.5f, 11.13f)
                lineTo(13.4f, 8.05f)
                curveTo(13.27f, 7.92f, 13.13f, 7.83f, 13f, 7.76f)
                lineTo(11.88f, 3.47f)
                curveTo(11.74f, 2.93f, 11.2f, 2.61f, 10.66f, 2.75f)
                curveTo(10.13f, 2.88f, 9.81f, 3.43f, 9.94f, 3.96f)
                lineTo(11f, 8.03f)
                verticalLineTo(8.03f)
                lineTo(8.67f, 3.19f)
                curveTo(8.44f, 2.69f, 7.84f, 2.5f, 7.34f, 2.71f)
                curveTo(6.84f, 2.95f, 6.63f, 3.55f, 6.87f, 4.05f)
                lineTo(8.56f, 7.59f)
                lineTo(5.19f, 4.25f)
                curveTo(4.8f, 3.86f, 4.16f, 3.86f, 3.77f, 4.25f)
                curveTo(3.38f, 4.65f, 3.39f, 5.28f, 3.78f, 5.67f)
                lineTo(7.5f, 9.37f)
                lineTo(6.8f, 9.64f)
                lineTo(5.72f, 10.07f)
                lineTo(3.81f, 11.39f)
                curveTo(3.81f, 11.39f, 3f, 12.44f, 2.93f, 12.89f)
                curveTo(2.85f, 13.34f, 3.72f, 15.6f, 3.72f, 15.6f)
                horizontalLineTo(3.73f)
                curveTo(3.89f, 15.94f, 4.23f, 16.18f, 4.63f, 16.18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.63f, 15.18f)
                curveTo(5.63f, 15.08f, 5.6f, 15f, 5.57f, 14.91f)
                lineTo(5.59f, 14.9f)
                lineTo(5f, 13.17f)
                lineTo(6.23f, 12.19f)
                curveTo(6.7f, 12.21f, 7.71f, 12.29f, 8.2f, 12.32f)
                curveTo(10.93f, 14.77f, 8.35f, 15.73f, 8.35f, 15.73f)
                lineTo(4.89f, 16.79f)
                lineTo(4.72f, 16.93f)
                curveTo(4.5f, 17.13f, 4.41f, 17.4f, 4.42f, 17.68f)
                lineTo(4.44f, 18.75f)
                lineTo(10.87f, 18.25f)
                curveTo(11.25f, 18.26f, 11.61f, 18.12f, 11.89f, 17.85f)
                lineTo(16.5f, 13.25f)
                curveTo(17.03f, 12.71f, 17.05f, 11.7f, 16.5f, 11.13f)
                close()
            }
        }.build()

        return _HandOkay!!
    }

@Suppress("ObjectPropertyName")
private var _HandOkay: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarFourPointsCircleOutline: ImageVector
    get() {
        if (_StarFourPointsCircleOutline != null) {
            return _StarFourPointsCircleOutline!!
        }
        _StarFourPointsCircleOutline = ImageVector.Builder(
            name = "StarFourPointsCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17f)
                lineTo(13.56f, 13.58f)
                lineTo(17f, 12f)
                lineTo(13.56f, 10.44f)
                lineTo(12f, 7f)
                lineTo(10.43f, 10.44f)
                lineTo(7f, 12f)
                lineTo(10.43f, 13.58f)
                lineTo(12f, 17f)
                moveTo(8.17f, 2.76f)
                curveTo(9.39f, 2.26f, 10.69f, 2f, 12f, 2f)
                curveTo(13.31f, 2f, 14.61f, 2.26f, 15.83f, 2.76f)
                curveTo(17.04f, 3.26f, 18.14f, 4f, 19.07f, 4.93f)
                curveTo(20f, 5.86f, 20.74f, 6.96f, 21.24f, 8.17f)
                curveTo(21.74f, 9.39f, 22f, 10.69f, 22f, 12f)
                curveTo(22f, 14.65f, 20.95f, 17.2f, 19.07f, 19.07f)
                curveTo(17.2f, 20.95f, 14.65f, 22f, 12f, 22f)
                curveTo(10.69f, 22f, 9.39f, 21.74f, 8.17f, 21.24f)
                curveTo(6.96f, 20.74f, 5.86f, 20f, 4.93f, 19.07f)
                curveTo(3.05f, 17.2f, 2f, 14.65f, 2f, 12f)
                curveTo(2f, 9.35f, 3.05f, 6.8f, 4.93f, 4.93f)
                curveTo(5.86f, 4f, 6.96f, 3.26f, 8.17f, 2.76f)
                moveTo(6.34f, 17.66f)
                curveTo(7.84f, 19.16f, 9.88f, 20f, 12f, 20f)
                curveTo(14.12f, 20f, 16.16f, 19.16f, 17.66f, 17.66f)
                curveTo(19.16f, 16.16f, 20f, 14.12f, 20f, 12f)
                curveTo(20f, 9.88f, 19.16f, 7.84f, 17.66f, 6.34f)
                curveTo(16.16f, 4.84f, 14.12f, 4f, 12f, 4f)
                curveTo(9.88f, 4f, 7.84f, 4.84f, 6.34f, 6.34f)
                curveTo(4.84f, 7.84f, 4f, 9.88f, 4f, 12f)
                curveTo(4f, 14.12f, 4.84f, 16.16f, 6.34f, 17.66f)
                close()
            }
        }.build()

        return _StarFourPointsCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StarFourPointsCircleOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EggEaster: ImageVector
    get() {
        if (_EggEaster != null) {
            return _EggEaster!!
        }
        _EggEaster = ImageVector.Builder(
            name = "EggEaster",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.89f, 6.36f)
                curveTo(8.23f, 3.91f, 10f, 2f, 12f, 2f)
                curveTo(14f, 2f, 15.77f, 3.91f, 17.11f, 6.36f)
                curveTo(16.26f, 6.57f, 15.5f, 7.07f, 15f, 7.77f)
                curveTo(13.79f, 6.11f, 11.46f, 5.75f, 9.8f, 6.97f)
                curveTo(9.5f, 7.19f, 9.22f, 7.46f, 9f, 7.77f)
                curveTo(8.5f, 7.07f, 7.74f, 6.57f, 6.89f, 6.36f)
                moveTo(15f, 18.06f)
                lineTo(12f, 15.06f)
                lineTo(9f, 18.06f)
                lineTo(6f, 15.06f)
                lineTo(4.73f, 16.33f)
                curveTo(5.75f, 20.35f, 9.83f, 22.77f, 13.84f, 21.76f)
                curveTo(16.5f, 21.08f, 18.59f, 19f, 19.27f, 16.33f)
                lineTo(18f, 15.06f)
                lineTo(15f, 18.06f)
                moveTo(9f, 15.94f)
                lineTo(12f, 12.94f)
                lineTo(15f, 15.94f)
                lineTo(18f, 12.94f)
                lineTo(19.5f, 14.44f)
                curveTo(19.37f, 12.13f, 18.8f, 9.86f, 17.81f, 7.76f)
                curveTo(16.65f, 7.86f, 15.75f, 8.83f, 15.75f, 10f)
                horizontalLineTo(14.25f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7.75f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.75f, 10f)
                horizontalLineTo(8.25f)
                curveTo(8.25f, 8.83f, 7.35f, 7.86f, 6.19f, 7.76f)
                curveTo(5.2f, 9.86f, 4.63f, 12.13f, 4.5f, 14.44f)
                lineTo(6f, 12.94f)
                lineTo(9f, 15.94f)
                close()
            }
        }.build()

        return _EggEaster!!
    }

@Suppress("ObjectPropertyName")
private var _EggEaster: ImageVector? = null

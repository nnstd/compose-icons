package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Mapbox: ImageVector
    get() {
        if (_Mapbox != null) {
            return _Mapbox!!
        }
        _Mapbox = ImageVector.Builder(
            name = "Mapbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(16.75f, 14.45f)
                curveTo(18.65f, 12.55f, 18.58f, 9.39f, 16.59f, 7.41f)
                curveTo(14.6f, 5.43f, 11.45f, 5.35f, 9.55f, 7.25f)
                curveTo(6.12f, 10.68f, 7.22f, 16.78f, 7.22f, 16.78f)
                curveTo(7.22f, 16.78f, 13.33f, 17.87f, 16.75f, 14.45f)
                moveTo(13.15f, 7.86f)
                lineTo(14.13f, 9.87f)
                lineTo(16.14f, 10.85f)
                lineTo(14.13f, 11.83f)
                lineTo(13.15f, 13.84f)
                lineTo(12.17f, 11.83f)
                lineTo(10.16f, 10.85f)
                lineTo(12.17f, 9.87f)
                lineTo(13.15f, 7.86f)
                close()
            }
        }.build()

        return _Mapbox!!
    }

@Suppress("ObjectPropertyName")
private var _Mapbox: ImageVector? = null

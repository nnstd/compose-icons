package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeartCircle: ImageVector
    get() {
        if (_HeartCircle != null) {
            return _HeartCircle!!
        }
        _HeartCircle = ImageVector.Builder(
            name = "HeartCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.47f, 2f, 2f, 6.5f, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(9.75f, 7.82f)
                curveTo(10.62f, 7.82f, 11.45f, 8.23f, 12f, 8.87f)
                curveTo(12.55f, 8.23f, 13.38f, 7.82f, 14.25f, 7.82f)
                curveTo(15.79f, 7.82f, 17f, 9.03f, 17f, 10.57f)
                curveTo(17f, 12.46f, 15.3f, 14f, 12.72f, 16.34f)
                lineTo(12f, 17f)
                lineTo(11.28f, 16.34f)
                curveTo(8.7f, 14f, 7f, 12.46f, 7f, 10.57f)
                curveTo(7f, 9.03f, 8.21f, 7.82f, 9.75f, 7.82f)
                close()
            }
        }.build()

        return _HeartCircle!!
    }

@Suppress("ObjectPropertyName")
private var _HeartCircle: ImageVector? = null

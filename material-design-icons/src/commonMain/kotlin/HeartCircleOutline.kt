package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeartCircleOutline: ImageVector
    get() {
        if (_HeartCircleOutline != null) {
            return _HeartCircleOutline!!
        }
        _HeartCircleOutline = ImageVector.Builder(
            name = "HeartCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                moveTo(9.75f, 7.82f)
                curveTo(8.21f, 7.82f, 7f, 9.03f, 7f, 10.57f)
                curveTo(7f, 12.46f, 8.7f, 14f, 11.28f, 16.34f)
                lineTo(12f, 17f)
                lineTo(12.72f, 16.34f)
                curveTo(15.3f, 14f, 17f, 12.46f, 17f, 10.57f)
                curveTo(17f, 9.03f, 15.79f, 7.82f, 14.25f, 7.82f)
                curveTo(13.38f, 7.82f, 12.55f, 8.23f, 12f, 8.87f)
                curveTo(11.45f, 8.23f, 10.62f, 7.82f, 9.75f, 7.82f)
                close()
            }
        }.build()

        return _HeartCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HeartCircleOutline: ImageVector? = null

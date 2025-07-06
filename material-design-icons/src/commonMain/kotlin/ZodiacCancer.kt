package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ZodiacCancer: ImageVector
    get() {
        if (_ZodiacCancer != null) {
            return _ZodiacCancer!!
        }
        _ZodiacCancer = ImageVector.Builder(
            name = "ZodiacCancer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                curveTo(6.5f, 4f, 2f, 7.58f, 2f, 12f)
                curveTo(2f, 14.12f, 3.65f, 15.87f, 5.76f, 16f)
                horizontalLineTo(6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 8f)
                horizontalLineTo(5.76f)
                curveTo(7.44f, 6.41f, 9.69f, 5.55f, 12f, 5.6f)
                curveTo(13.77f, 5.58f, 15.5f, 6.07f, 17f, 7f)
                lineTo(18.25f, 5.75f)
                curveTo(16.38f, 4.58f, 14.21f, 3.97f, 12f, 4f)
                moveTo(6f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 12f)
                curveTo(8f, 13.11f, 7.08f, 14f, 6f, 14f)
                curveTo(4.96f, 14f, 4.1f, 13.22f, 4f, 12.2f)
                curveTo(4f, 12.07f, 4f, 11.93f, 4f, 11.8f)
                curveTo(4.1f, 10.77f, 4.97f, 10f, 6f, 10f)
                moveTo(18.24f, 8f)
                horizontalLineTo(18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 16f)
                horizontalLineTo(18.24f)
                curveTo(16.56f, 17.59f, 14.31f, 18.45f, 12f, 18.4f)
                curveTo(10.23f, 18.42f, 8.5f, 17.93f, 7f, 17f)
                lineTo(5.76f, 18.24f)
                curveTo(7.63f, 19.41f, 9.79f, 20f, 12f, 20f)
                curveTo(17.5f, 20f, 22f, 16.42f, 22f, 12f)
                curveTo(22f, 9.88f, 20.35f, 8.13f, 18.24f, 8f)
                moveTo(18f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 12f)
                curveTo(16f, 10.89f, 16.92f, 10f, 18f, 10f)
                curveTo(19.04f, 10f, 19.9f, 10.78f, 20f, 11.8f)
                curveTo(20f, 11.93f, 20f, 12.07f, 20f, 12.2f)
                curveTo(19.9f, 13.23f, 19.03f, 14f, 18f, 14f)
                close()
            }
        }.build()

        return _ZodiacCancer!!
    }

@Suppress("ObjectPropertyName")
private var _ZodiacCancer: ImageVector? = null

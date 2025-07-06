package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountClock: ImageVector
    get() {
        if (_AccountClock != null) {
            return _AccountClock!!
        }
        _AccountClock = ImageVector.Builder(
            name = "AccountClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.63f, 14.1f)
                curveTo(12.23f, 10.58f, 16.38f, 9.03f, 19.9f, 10.63f)
                curveTo(23.42f, 12.23f, 24.97f, 16.38f, 23.37f, 19.9f)
                curveTo(22.24f, 22.4f, 19.75f, 24f, 17f, 24f)
                curveTo(14.3f, 24f, 11.83f, 22.44f, 10.67f, 20f)
                horizontalLineTo(1f)
                verticalLineTo(18f)
                curveTo(1.06f, 16.86f, 1.84f, 15.93f, 3.34f, 15.18f)
                curveTo(4.84f, 14.43f, 6.72f, 14.04f, 9f, 14f)
                curveTo(9.57f, 14f, 10.11f, 14.05f, 10.63f, 14.1f)
                verticalLineTo(14.1f)
                moveTo(9f, 4f)
                curveTo(10.12f, 4.03f, 11.06f, 4.42f, 11.81f, 5.17f)
                curveTo(12.56f, 5.92f, 12.93f, 6.86f, 12.93f, 8f)
                curveTo(12.93f, 9.14f, 12.56f, 10.08f, 11.81f, 10.83f)
                curveTo(11.06f, 11.58f, 10.12f, 11.95f, 9f, 11.95f)
                curveTo(7.88f, 11.95f, 6.94f, 11.58f, 6.19f, 10.83f)
                curveTo(5.44f, 10.08f, 5.07f, 9.14f, 5.07f, 8f)
                curveTo(5.07f, 6.86f, 5.44f, 5.92f, 6.19f, 5.17f)
                curveTo(6.94f, 4.42f, 7.88f, 4.03f, 9f, 4f)
                moveTo(17f, 22f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 22f)
                moveTo(16f, 14f)
                horizontalLineTo(17.5f)
                verticalLineTo(16.82f)
                lineTo(19.94f, 18.23f)
                lineTo(19.19f, 19.53f)
                lineTo(16f, 17.69f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _AccountClock!!
    }

@Suppress("ObjectPropertyName")
private var _AccountClock: ImageVector? = null

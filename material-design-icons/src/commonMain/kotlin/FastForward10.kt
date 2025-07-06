package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FastForward10: ImageVector
    get() {
        if (_FastForward10 != null) {
            return _FastForward10!!
        }
        _FastForward10 = ImageVector.Builder(
            name = "FastForward10",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 12f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                moveTo(18f, 14f)
                verticalLineTo(20f)
                curveTo(18f, 21.11f, 17.11f, 22f, 16f, 22f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 12f)
                horizontalLineTo(16f)
                curveTo(17.11f, 12f, 18f, 12.9f, 18f, 14f)
                moveTo(14f, 14f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                moveTo(11.5f, 3f)
                curveTo(14.15f, 3f, 16.55f, 4f, 18.4f, 5.6f)
                lineTo(21f, 3f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                lineTo(16.62f, 7.38f)
                curveTo(15.23f, 6.22f, 13.46f, 5.5f, 11.5f, 5.5f)
                curveTo(7.96f, 5.5f, 4.95f, 7.81f, 3.9f, 11f)
                lineTo(1.53f, 10.22f)
                curveTo(2.92f, 6.03f, 6.85f, 3f, 11.5f, 3f)
                close()
            }
        }.build()

        return _FastForward10!!
    }

@Suppress("ObjectPropertyName")
private var _FastForward10: ImageVector? = null

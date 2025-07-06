package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FastForward30: ImageVector
    get() {
        if (_FastForward30 != null) {
            return _FastForward30!!
        }
        _FastForward30 = ImageVector.Builder(
            name = "FastForward30",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 3f)
                curveTo(6.85f, 3f, 2.92f, 6.03f, 1.53f, 10.22f)
                lineTo(3.9f, 11f)
                curveTo(4.95f, 7.81f, 7.96f, 5.5f, 11.5f, 5.5f)
                curveTo(13.46f, 5.5f, 15.23f, 6.22f, 16.62f, 7.38f)
                lineTo(14f, 10f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                lineTo(18.4f, 5.6f)
                curveTo(16.55f, 4f, 14.15f, 3f, 11.5f, 3f)
                moveTo(19f, 14f)
                verticalLineTo(20f)
                curveTo(19f, 21.11f, 18.11f, 22f, 17f, 22f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 20f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                horizontalLineTo(17f)
                curveTo(18.11f, 12f, 19f, 12.9f, 19f, 14f)
                moveTo(15f, 14f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                moveTo(11f, 20f)
                curveTo(11f, 21.11f, 10.1f, 22f, 9f, 22f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 14f)
                verticalLineTo(15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 18.5f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _FastForward30!!
    }

@Suppress("ObjectPropertyName")
private var _FastForward30: ImageVector? = null

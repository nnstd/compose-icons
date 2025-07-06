package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FractionOneHalf: ImageVector
    get() {
        if (_FractionOneHalf != null) {
            return _FractionOneHalf!!
        }
        _FractionOneHalf = ImageVector.Builder(
            name = "FractionOneHalf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.79f, 21.61f)
                lineTo(4.21f, 20.39f)
                lineTo(18.21f, 2.39f)
                lineTo(19.79f, 3.61f)
                lineTo(5.79f, 21.61f)
                moveTo(4f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                moveTo(15f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                curveTo(15.9f, 16f, 15f, 16.9f, 15f, 18f)
                verticalLineTo(22f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                curveTo(20.11f, 18f, 21f, 17.11f, 21f, 16f)
                verticalLineTo(14f)
                curveTo(21f, 12.9f, 20.11f, 12f, 19f, 12f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _FractionOneHalf!!
    }

@Suppress("ObjectPropertyName")
private var _FractionOneHalf: ImageVector? = null

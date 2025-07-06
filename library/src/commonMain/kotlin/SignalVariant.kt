package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SignalVariant: ImageVector
    get() {
        if (_SignalVariant != null) {
            return _SignalVariant!!
        }
        _SignalVariant = ImageVector.Builder(
            name = "SignalVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6f)
                verticalLineTo(4f)
                horizontalLineTo(4.1f)
                curveTo(12.9f, 4f, 20f, 11.1f, 20f, 19.9f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(19.9f)
                curveTo(18f, 12.2f, 11.8f, 6f, 4f, 6f)
                moveTo(4f, 10f)
                verticalLineTo(8f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 20f)
                horizontalLineTo(14f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 10f)
                moveTo(4f, 14f)
                verticalLineTo(12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                horizontalLineTo(10f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 14f)
                moveTo(4f, 16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _SignalVariant!!
    }

@Suppress("ObjectPropertyName")
private var _SignalVariant: ImageVector? = null

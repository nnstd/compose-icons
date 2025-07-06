package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SignalDistanceVariant: ImageVector
    get() {
        if (_SignalDistanceVariant != null) {
            return _SignalDistanceVariant!!
        }
        _SignalDistanceVariant = ImageVector.Builder(
            name = "SignalDistanceVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6f)
                verticalLineTo(4f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                horizontalLineTo(14f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 6f)
                moveTo(4f, 10f)
                verticalLineTo(8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                horizontalLineTo(10f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 10f)
                moveTo(4f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 16f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                moveTo(3f, 18f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                lineTo(22f, 19f)
                lineTo(19f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _SignalDistanceVariant!!
    }

@Suppress("ObjectPropertyName")
private var _SignalDistanceVariant: ImageVector? = null

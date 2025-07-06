package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailOpen: ImageVector
    get() {
        if (_EmailOpen != null) {
            return _EmailOpen!!
        }
        _EmailOpen = ImageVector.Builder(
            name = "EmailOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 8f)
                lineTo(12f, 13f)
                lineTo(20f, 8f)
                verticalLineTo(8f)
                lineTo(12f, 3f)
                lineTo(4f, 8f)
                verticalLineTo(8f)
                moveTo(22f, 8f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                verticalLineTo(8f)
                curveTo(2f, 7.27f, 2.39f, 6.64f, 2.97f, 6.29f)
                lineTo(12f, 0.64f)
                lineTo(21.03f, 6.29f)
                curveTo(21.61f, 6.64f, 22f, 7.27f, 22f, 8f)
                close()
            }
        }.build()

        return _EmailOpen!!
    }

@Suppress("ObjectPropertyName")
private var _EmailOpen: ImageVector? = null

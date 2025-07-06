package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailVariant: ImageVector
    get() {
        if (_EmailVariant != null) {
            return _EmailVariant!!
        }
        _EmailVariant = ImageVector.Builder(
            name = "EmailVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 13f)
                lineTo(2f, 6.76f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.89f, 4f, 4f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                verticalLineTo(6.75f)
                lineTo(12f, 13f)
                moveTo(22f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                horizontalLineTo(4f)
                curveTo(2.89f, 20f, 2f, 19.1f, 2f, 18f)
                verticalLineTo(9.11f)
                lineTo(4f, 10.36f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(10.36f)
                lineTo(22f, 9.11f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _EmailVariant!!
    }

@Suppress("ObjectPropertyName")
private var _EmailVariant: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Account: ImageVector
    get() {
        if (_Account != null) {
            return _Account!!
        }
        _Account = ImageVector.Builder(
            name = "Account",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                moveTo(12f, 14f)
                curveTo(16.42f, 14f, 20f, 15.79f, 20f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                curveTo(4f, 15.79f, 7.58f, 14f, 12f, 14f)
                close()
            }
        }.build()

        return _Account!!
    }

@Suppress("ObjectPropertyName")
private var _Account: ImageVector? = null

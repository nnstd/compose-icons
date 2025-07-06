package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WindowOpen: ImageVector
    get() {
        if (_WindowOpen != null) {
            return _WindowOpen!!
        }
        _WindowOpen = ImageVector.Builder(
            name = "WindowOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 8f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                moveTo(18f, 10f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                moveTo(6f, 20f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                moveTo(6f, 2f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                close()
            }
        }.build()

        return _WindowOpen!!
    }

@Suppress("ObjectPropertyName")
private var _WindowOpen: ImageVector? = null

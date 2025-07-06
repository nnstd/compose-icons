package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Library: ImageVector
    get() {
        if (_Library != null) {
            return _Library!!
        }
        _Library = ImageVector.Builder(
            name = "Library",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                moveTo(12f, 11.54f)
                curveTo(9.64f, 9.35f, 6.5f, 8f, 3f, 8f)
                verticalLineTo(19f)
                curveTo(6.5f, 19f, 9.64f, 20.35f, 12f, 22.54f)
                curveTo(14.36f, 20.35f, 17.5f, 19f, 21f, 19f)
                verticalLineTo(8f)
                curveTo(17.5f, 8f, 14.36f, 9.35f, 12f, 11.54f)
                close()
            }
        }.build()

        return _Library!!
    }

@Suppress("ObjectPropertyName")
private var _Library: ImageVector? = null

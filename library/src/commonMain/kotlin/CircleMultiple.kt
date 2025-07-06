package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CircleMultiple: ImageVector
    get() {
        if (_CircleMultiple != null) {
            return _CircleMultiple!!
        }
        _CircleMultiple = ImageVector.Builder(
            name = "CircleMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 4f)
                moveTo(3f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 17.65f)
                verticalLineTo(19.74f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 4.26f)
                verticalLineTo(6.35f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12f)
                close()
            }
        }.build()

        return _CircleMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _CircleMultiple: ImageVector? = null

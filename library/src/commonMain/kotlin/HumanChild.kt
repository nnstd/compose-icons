package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanChild: ImageVector
    get() {
        if (_HumanChild != null) {
            return _HumanChild!!
        }
        _HumanChild = ImageVector.Builder(
            name = "HumanChild",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(11f, 22f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _HumanChild!!
    }

@Suppress("ObjectPropertyName")
private var _HumanChild: ImageVector? = null

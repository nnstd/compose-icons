package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PowerSocketUs: ImageVector
    get() {
        if (_PowerSocketUs != null) {
            return _PowerSocketUs!!
        }
        _PowerSocketUs = ImageVector.Builder(
            name = "PowerSocketUs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 7f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                moveTo(4.22f, 2f)
                horizontalLineTo(19.78f)
                curveTo(21f, 2f, 22f, 3f, 22f, 4.22f)
                verticalLineTo(19.78f)
                arcTo(2.22f, 2.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.78f, 22f)
                horizontalLineTo(4.22f)
                curveTo(3f, 22f, 2f, 21f, 2f, 19.78f)
                verticalLineTo(4.22f)
                arcTo(2.22f, 2.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.22f, 2f)
                moveTo(12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                moveTo(14f, 7.5f)
                horizontalLineTo(16f)
                verticalLineTo(11.5f)
                horizontalLineTo(14f)
                verticalLineTo(7.5f)
                moveTo(10.5f, 16.25f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14.75f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 16.25f)
                verticalLineTo(17f)
                horizontalLineTo(10.5f)
                verticalLineTo(16.25f)
                close()
            }
        }.build()

        return _PowerSocketUs!!
    }

@Suppress("ObjectPropertyName")
private var _PowerSocketUs: ImageVector? = null

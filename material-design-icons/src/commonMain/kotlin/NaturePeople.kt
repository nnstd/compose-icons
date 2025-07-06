package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NaturePeople: ImageVector
    get() {
        if (_NaturePeople != null) {
            return _NaturePeople!!
        }
        _NaturePeople = ImageVector.Builder(
            name = "NaturePeople",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 11f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 11f)
                moveTo(22.17f, 9.17f)
                curveTo(22.17f, 5.3f, 19.04f, 2.17f, 15.17f, 2.17f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.17f, 9.17f)
                curveTo(8.17f, 12.64f, 10.69f, 15.5f, 14f, 16.06f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 12f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(16.12f)
                curveTo(19.47f, 15.71f, 22.17f, 12.76f, 22.17f, 9.17f)
                close()
            }
        }.build()

        return _NaturePeople!!
    }

@Suppress("ObjectPropertyName")
private var _NaturePeople: ImageVector? = null

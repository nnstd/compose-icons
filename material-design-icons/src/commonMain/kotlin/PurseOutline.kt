package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PurseOutline: ImageVector
    get() {
        if (_PurseOutline != null) {
            return _PurseOutline!!
        }
        _PurseOutline = ImageVector.Builder(
            name = "PurseOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 11f)
                lineTo(20f, 19f)
                horizontalLineTo(4f)
                lineTo(5f, 11f)
                horizontalLineTo(19f)
                moveTo(14f, 3f)
                horizontalLineTo(10f)
                lineTo(8f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(4.7f)
                arcTo(1.65f, 1.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 10.5f)
                lineTo(2f, 19.1f)
                arcTo(1.74f, 1.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.7f, 21f)
                horizontalLineTo(20.3f)
                arcTo(1.74f, 1.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 19.1f)
                lineTo(21f, 10.5f)
                arcTo(1.65f, 1.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.3f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                lineTo(14f, 3f)
                moveTo(10f, 9f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
            }
        }.build()

        return _PurseOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PurseOutline: ImageVector? = null

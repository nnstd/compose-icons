package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrashCan: ImageVector
    get() {
        if (_TrashCan != null) {
            return _TrashCan!!
        }
        _TrashCan = ImageVector.Builder(
            name = "TrashCan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 21f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 19f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                moveTo(9f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                moveTo(13f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _TrashCan!!
    }

@Suppress("ObjectPropertyName")
private var _TrashCan: ImageVector? = null

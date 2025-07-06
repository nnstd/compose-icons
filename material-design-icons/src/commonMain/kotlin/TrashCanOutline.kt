package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrashCanOutline: ImageVector
    get() {
        if (_TrashCanOutline != null) {
            return _TrashCanOutline!!
        }
        _TrashCanOutline = ImageVector.Builder(
            name = "TrashCanOutline",
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
                moveTo(7f, 6f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                moveTo(9f, 8f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                moveTo(13f, 8f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _TrashCanOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TrashCanOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LockerMultiple: ImageVector
    get() {
        if (_LockerMultiple != null) {
            return _LockerMultiple!!
        }
        _LockerMultiple = ImageVector.Builder(
            name = "LockerMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 2f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 22f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                moveTo(13f, 4f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                moveTo(3f, 4f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                moveTo(5f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                moveTo(5f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(7.5f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                moveTo(5f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(10.5f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                moveTo(15f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                moveTo(15f, 6f)
                horizontalLineTo(19f)
                verticalLineTo(7.5f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                moveTo(15f, 9f)
                horizontalLineTo(19f)
                verticalLineTo(10.5f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _LockerMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _LockerMultiple: ImageVector? = null

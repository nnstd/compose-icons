package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InboxMultipleOutline: ImageVector
    get() {
        if (_InboxMultipleOutline != null) {
            return _InboxMultipleOutline!!
        }
        _InboxMultipleOutline = ImageVector.Builder(
            name = "InboxMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 14f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                moveTo(5f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(9.4f)
                curveTo(8.8f, 11.47f, 8.34f, 10.78f, 8.13f, 10f)
                horizontalLineTo(5f)
                moveTo(19f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(15.87f)
                curveTo(15.66f, 10.78f, 15.2f, 11.47f, 14.6f, 12f)
                horizontalLineTo(19f)
                moveTo(19f, 8f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                curveTo(10f, 10.07f, 10.93f, 11f, 12f, 11f)
                curveTo(13.07f, 11f, 14f, 10.07f, 14f, 9f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                moveTo(21f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                curveTo(10f, 17.07f, 10.93f, 18f, 12f, 18f)
                curveTo(13.07f, 18f, 14f, 17.07f, 14f, 16f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                moveTo(5f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(9.4f)
                curveTo(8.8f, 18.47f, 8.34f, 17.78f, 8.13f, 17f)
                horizontalLineTo(5f)
                moveTo(19f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(15.87f)
                curveTo(15.66f, 17.78f, 15.2f, 18.47f, 14.6f, 19f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _InboxMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _InboxMultipleOutline: ImageVector? = null

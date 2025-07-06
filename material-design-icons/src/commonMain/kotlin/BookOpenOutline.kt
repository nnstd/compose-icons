package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookOpenOutline: ImageVector
    get() {
        if (_BookOpenOutline != null) {
            return _BookOpenOutline!!
        }
        _BookOpenOutline = ImageVector.Builder(
            name = "BookOpenOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 4f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 6f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 21f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 19f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 4f)
                moveTo(3f, 19f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                moveTo(21f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                moveTo(14f, 9.5f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                verticalLineTo(9.5f)
                moveTo(14f, 12f)
                horizontalLineTo(20f)
                verticalLineTo(13.5f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                moveTo(14f, 14.5f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()

        return _BookOpenOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookOpenOutline: ImageVector? = null

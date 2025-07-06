package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LockPattern: ImageVector
    get() {
        if (_LockPattern != null) {
            return _LockPattern!!
        }
        _LockPattern = ImageVector.Builder(
            name = "LockPattern",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 3f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 7f)
                curveTo(11f, 8.86f, 9.73f, 10.43f, 8f, 10.87f)
                verticalLineTo(13.13f)
                curveTo(8.37f, 13.22f, 8.72f, 13.37f, 9.04f, 13.56f)
                lineTo(13.56f, 9.04f)
                curveTo(13.2f, 8.44f, 13f, 7.75f, 13f, 7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 3f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 11f)
                curveTo(16.26f, 11f, 15.57f, 10.8f, 15f, 10.45f)
                lineTo(10.45f, 15f)
                curveTo(10.8f, 15.57f, 11f, 16.26f, 11f, 17f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 21f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 17f)
                curveTo(3f, 15.14f, 4.27f, 13.57f, 6f, 13.13f)
                verticalLineTo(10.87f)
                curveTo(4.27f, 10.43f, 3f, 8.86f, 3f, 7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 3f)
                moveTo(17f, 13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 17f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 21f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 17f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 13f)
                moveTo(17f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 15f)
                close()
            }
        }.build()

        return _LockPattern!!
    }

@Suppress("ObjectPropertyName")
private var _LockPattern: ImageVector? = null

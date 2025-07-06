package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GoogleClassroom: ImageVector
    get() {
        if (_GoogleClassroom != null) {
            return _GoogleClassroom!!
        }
        _GoogleClassroom = ImageVector.Builder(
            name = "GoogleClassroom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 2f)
                horizontalLineTo(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 22f)
                horizontalLineTo(23f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 21f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 2f)
                moveTo(22f, 20f)
                horizontalLineTo(20f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                moveTo(10.29f, 9.71f)
                arcTo(1.71f, 1.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                curveTo(12.95f, 8f, 13.71f, 8.77f, 13.71f, 9.71f)
                curveTo(13.71f, 10.66f, 12.95f, 11.43f, 12f, 11.43f)
                curveTo(11.05f, 11.43f, 10.29f, 10.66f, 10.29f, 9.71f)
                moveTo(5.71f, 11.29f)
                curveTo(5.71f, 10.58f, 6.29f, 10f, 7f, 10f)
                arcTo(1.29f, 1.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.29f, 11.29f)
                curveTo(8.29f, 12f, 7.71f, 12.57f, 7f, 12.57f)
                curveTo(6.29f, 12.57f, 5.71f, 12f, 5.71f, 11.29f)
                moveTo(15.71f, 11.29f)
                arcTo(1.29f, 1.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 10f)
                arcTo(1.29f, 1.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.29f, 11.29f)
                curveTo(18.29f, 12f, 17.71f, 12.57f, 17f, 12.57f)
                curveTo(16.29f, 12.57f, 15.71f, 12f, 15.71f, 11.29f)
                moveTo(20f, 15.14f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                lineTo(14f, 16f)
                horizontalLineTo(10f)
                lineTo(8f, 16f)
                horizontalLineTo(4f)
                verticalLineTo(15.14f)
                curveTo(4f, 14.2f, 5.55f, 13.43f, 7f, 13.43f)
                curveTo(7.55f, 13.43f, 8.11f, 13.54f, 8.6f, 13.73f)
                curveTo(9.35f, 13.04f, 10.7f, 12.57f, 12f, 12.57f)
                curveTo(13.3f, 12.57f, 14.65f, 13.04f, 15.4f, 13.73f)
                curveTo(15.89f, 13.54f, 16.45f, 13.43f, 17f, 13.43f)
                curveTo(18.45f, 13.43f, 20f, 14.2f, 20f, 15.14f)
                close()
            }
        }.build()

        return _GoogleClassroom!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleClassroom: ImageVector? = null

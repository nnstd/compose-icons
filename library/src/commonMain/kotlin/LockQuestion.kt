package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LockQuestion: ImageVector
    get() {
        if (_LockQuestion != null) {
            return _LockQuestion!!
        }
        _LockQuestion = ImageVector.Builder(
            name = "LockQuestion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 10f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 8f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1f)
                moveTo(12f, 2.9f)
                curveTo(13.71f, 2.9f, 15.1f, 4.29f, 15.1f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(8.9f)
                verticalLineTo(6f)
                curveTo(8.9f, 4.29f, 10.29f, 2.9f, 12f, 2.9f)
                moveTo(12.19f, 10.5f)
                curveTo(13.13f, 10.5f, 13.88f, 10.71f, 14.42f, 11.12f)
                curveTo(14.96f, 11.54f, 15.23f, 12.1f, 15.23f, 12.8f)
                curveTo(15.23f, 13.24f, 15.08f, 13.63f, 14.79f, 14f)
                curveTo(14.5f, 14.36f, 14.12f, 14.64f, 13.66f, 14.85f)
                curveTo(13.4f, 15f, 13.23f, 15.15f, 13.14f, 15.32f)
                curveTo(13.05f, 15.5f, 13f, 15.72f, 13f, 16f)
                horizontalLineTo(11f)
                curveTo(11f, 15.5f, 11.1f, 15.16f, 11.29f, 14.92f)
                curveTo(11.5f, 14.68f, 11.84f, 14.4f, 12.36f, 14.08f)
                curveTo(12.62f, 13.94f, 12.83f, 13.76f, 13f, 13.54f)
                curveTo(13.14f, 13.33f, 13.22f, 13.08f, 13.22f, 12.8f)
                curveTo(13.22f, 12.5f, 13.13f, 12.28f, 12.95f, 12.11f)
                curveTo(12.77f, 11.93f, 12.5f, 11.85f, 12.19f, 11.85f)
                curveTo(11.92f, 11.85f, 11.7f, 11.92f, 11.5f, 12.06f)
                curveTo(11.34f, 12.2f, 11.24f, 12.41f, 11.24f, 12.69f)
                horizontalLineTo(9.27f)
                curveTo(9.22f, 12f, 9.5f, 11.4f, 10.05f, 11.04f)
                curveTo(10.59f, 10.68f, 11.3f, 10.5f, 12.19f, 10.5f)
                moveTo(11f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _LockQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _LockQuestion: ImageVector? = null

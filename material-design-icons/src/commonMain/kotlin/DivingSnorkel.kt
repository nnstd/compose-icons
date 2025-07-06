package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DivingSnorkel: ImageVector
    get() {
        if (_DivingSnorkel != null) {
            return _DivingSnorkel!!
        }
        _DivingSnorkel = ImageVector.Builder(
            name = "DivingSnorkel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 3f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5f)
                verticalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                horizontalLineTo(7.15f)
                curveTo(7.57f, 12f, 7.95f, 12.24f, 8.1f, 12.63f)
                curveTo(8.44f, 13.68f, 9.58f, 14.25f, 10.62f, 13.91f)
                curveTo(11.23f, 13.71f, 11.7f, 13.23f, 11.9f, 12.63f)
                curveTo(12.05f, 12.24f, 12.43f, 12f, 12.85f, 12f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 10f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 3f)
                moveTo(16f, 10f)
                horizontalLineTo(11.35f)
                curveTo(11.1f, 9.46f, 10.59f, 9.09f, 10f, 9f)
                curveTo(9.41f, 9.09f, 8.9f, 9.46f, 8.65f, 10f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                moveTo(22f, 2f)
                verticalLineTo(15.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 22f)
                curveTo(13.79f, 22f, 12.15f, 21.32f, 10.93f, 20.12f)
                curveTo(8.95f, 20.58f, 6.88f, 19.79f, 5.71f, 18.12f)
                lineTo(7.62f, 17.29f)
                curveTo(8.5f, 18.22f, 9.84f, 18.5f, 11f, 18f)
                curveTo(11.2f, 17.91f, 11.39f, 17.8f, 11.56f, 17.67f)
                curveTo(12.4f, 17.05f, 12.87f, 16.04f, 12.78f, 15f)
                lineTo(14.69f, 14.17f)
                curveTo(15.1f, 16.04f, 14.41f, 18f, 12.9f, 19.17f)
                curveTo(13.66f, 19.71f, 14.57f, 20f, 15.5f, 20f)
                curveTo(18f, 20f, 20f, 18f, 20f, 15.5f)
                verticalLineTo(2f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _DivingSnorkel!!
    }

@Suppress("ObjectPropertyName")
private var _DivingSnorkel: ImageVector? = null

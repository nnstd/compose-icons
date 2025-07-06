package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneClassic: ImageVector
    get() {
        if (_PhoneClassic != null) {
            return _PhoneClassic!!
        }
        _PhoneClassic = ImageVector.Builder(
            name = "PhoneClassic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(7.46f, 3f, 3.34f, 4.78f, 0.29f, 7.67f)
                curveTo(0.11f, 7.85f, 0f, 8.1f, 0f, 8.38f)
                curveTo(0f, 8.66f, 0.11f, 8.91f, 0.29f, 9.09f)
                lineTo(2.77f, 11.57f)
                curveTo(2.95f, 11.75f, 3.2f, 11.86f, 3.5f, 11.86f)
                curveTo(3.75f, 11.86f, 4f, 11.75f, 4.18f, 11.58f)
                curveTo(4.97f, 10.84f, 5.87f, 10.22f, 6.84f, 9.73f)
                curveTo(7.17f, 9.57f, 7.4f, 9.23f, 7.4f, 8.83f)
                verticalLineTo(5.73f)
                curveTo(8.85f, 5.25f, 10.39f, 5f, 12f, 5f)
                curveTo(13.59f, 5f, 15.14f, 5.25f, 16.59f, 5.72f)
                verticalLineTo(8.82f)
                curveTo(16.59f, 9.21f, 16.82f, 9.56f, 17.15f, 9.72f)
                curveTo(18.13f, 10.21f, 19f, 10.84f, 19.82f, 11.57f)
                curveTo(20f, 11.75f, 20.25f, 11.85f, 20.5f, 11.85f)
                curveTo(20.8f, 11.85f, 21.05f, 11.74f, 21.23f, 11.56f)
                lineTo(23.71f, 9.08f)
                curveTo(23.89f, 8.9f, 24f, 8.65f, 24f, 8.37f)
                curveTo(24f, 8.09f, 23.88f, 7.85f, 23.7f, 7.67f)
                curveTo(20.65f, 4.78f, 16.53f, 3f, 12f, 3f)
                moveTo(9f, 7f)
                verticalLineTo(10f)
                curveTo(9f, 10f, 3f, 15f, 3f, 18f)
                verticalLineTo(22f)
                horizontalLineTo(21f)
                verticalLineTo(18f)
                curveTo(21f, 15f, 15f, 10f, 15f, 10f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                moveTo(12f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                moveTo(12f, 13.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 16f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 16f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13.5f)
                close()
            }
        }.build()

        return _PhoneClassic!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneClassic: ImageVector? = null

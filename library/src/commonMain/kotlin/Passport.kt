package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Passport: ImageVector
    get() {
        if (_Passport != null) {
            return _Passport!!
        }
        _Passport = ImageVector.Builder(
            name = "Passport",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 2f)
                horizontalLineTo(6f)
                moveTo(12f, 5f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 10f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 10f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                moveTo(12f, 6f)
                curveTo(11.59f, 6.62f, 11.25f, 7.29f, 11.04f, 8f)
                horizontalLineTo(12.96f)
                curveTo(12.75f, 7.29f, 12.42f, 6.62f, 12f, 6f)
                moveTo(10.7f, 6.22f)
                curveTo(9.78f, 6.53f, 9f, 7.17f, 8.54f, 8f)
                horizontalLineTo(10f)
                curveTo(10.18f, 7.38f, 10.4f, 6.78f, 10.7f, 6.22f)
                moveTo(13.29f, 6.22f)
                curveTo(13.59f, 6.78f, 13.82f, 7.38f, 14f, 8f)
                horizontalLineTo(15.46f)
                curveTo(15f, 7.17f, 14.21f, 6.54f, 13.29f, 6.22f)
                moveTo(8.13f, 9f)
                curveTo(8.05f, 9.32f, 8f, 9.65f, 8f, 10f)
                curveTo(8f, 10.35f, 8.05f, 10.68f, 8.13f, 11f)
                horizontalLineTo(9.82f)
                curveTo(9.78f, 10.67f, 9.75f, 10.34f, 9.75f, 10f)
                curveTo(9.75f, 9.66f, 9.78f, 9.33f, 9.82f, 9f)
                horizontalLineTo(8.13f)
                moveTo(10.83f, 9f)
                curveTo(10.78f, 9.32f, 10.75f, 9.66f, 10.75f, 10f)
                curveTo(10.75f, 10.34f, 10.78f, 10.67f, 10.83f, 11f)
                horizontalLineTo(13.17f)
                curveTo(13.21f, 10.67f, 13.25f, 10.34f, 13.25f, 10f)
                curveTo(13.25f, 9.66f, 13.21f, 9.32f, 13.17f, 9f)
                horizontalLineTo(10.83f)
                moveTo(14.18f, 9f)
                curveTo(14.22f, 9.33f, 14.25f, 9.66f, 14.25f, 10f)
                curveTo(14.25f, 10.34f, 14.22f, 10.67f, 14.18f, 11f)
                horizontalLineTo(15.87f)
                curveTo(15.95f, 10.68f, 16f, 10.35f, 16f, 10f)
                curveTo(16f, 9.65f, 15.95f, 9.32f, 15.87f, 9f)
                horizontalLineTo(14.18f)
                moveTo(8.54f, 12f)
                curveTo(9f, 12.83f, 9.78f, 13.46f, 10.7f, 13.78f)
                curveTo(10.4f, 13.22f, 10.18f, 12.63f, 10f, 12f)
                horizontalLineTo(8.54f)
                moveTo(11.04f, 12f)
                curveTo(11.25f, 12.72f, 11.59f, 13.38f, 12f, 14f)
                curveTo(12.42f, 13.38f, 12.75f, 12.72f, 12.96f, 12f)
                horizontalLineTo(11.04f)
                moveTo(14f, 12f)
                curveTo(13.82f, 12.63f, 13.59f, 13.22f, 13.29f, 13.78f)
                curveTo(14.21f, 13.46f, 15f, 12.83f, 15.46f, 12f)
                horizontalLineTo(14f)
                moveTo(7f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _Passport!!
    }

@Suppress("ObjectPropertyName")
private var _Passport: ImageVector? = null

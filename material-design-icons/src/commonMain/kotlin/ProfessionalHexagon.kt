package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ProfessionalHexagon: ImageVector
    get() {
        if (_ProfessionalHexagon != null) {
            return _ProfessionalHexagon!!
        }
        _ProfessionalHexagon = ImageVector.Builder(
            name = "ProfessionalHexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16.5f)
                curveTo(21f, 16.88f, 20.79f, 17.21f, 20.47f, 17.38f)
                lineTo(12.57f, 21.82f)
                curveTo(12.41f, 21.94f, 12.21f, 22f, 12f, 22f)
                curveTo(11.79f, 22f, 11.59f, 21.94f, 11.43f, 21.82f)
                lineTo(3.53f, 17.38f)
                curveTo(3.21f, 17.21f, 3f, 16.88f, 3f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(3f, 7.12f, 3.21f, 6.79f, 3.53f, 6.62f)
                lineTo(11.43f, 2.18f)
                curveTo(11.59f, 2.06f, 11.79f, 2f, 12f, 2f)
                curveTo(12.21f, 2f, 12.41f, 2.06f, 12.57f, 2.18f)
                lineTo(20.47f, 6.62f)
                curveTo(20.79f, 6.79f, 21f, 7.12f, 21f, 7.5f)
                verticalLineTo(16.5f)
                moveTo(5f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(6.25f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 9f)
                horizontalLineTo(5f)
                moveTo(6.25f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(6.75f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.75f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.75f, 12f)
                horizontalLineTo(6.25f)
                moveTo(9.75f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(11.75f)
                lineTo(12.41f, 15f)
                horizontalLineTo(13.73f)
                lineTo(12.94f, 12.61f)
                curveTo(13.43f, 12.25f, 13.75f, 11.66f, 13.75f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.75f, 9f)
                horizontalLineTo(9.75f)
                moveTo(11f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(11.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 12f)
                horizontalLineTo(11f)
                moveTo(17f, 9f)
                curveTo(15.62f, 9f, 14.5f, 10.34f, 14.5f, 12f)
                curveTo(14.5f, 13.66f, 15.62f, 15f, 17f, 15f)
                curveTo(18.38f, 15f, 19.5f, 13.66f, 19.5f, 12f)
                curveTo(19.5f, 10.34f, 18.38f, 9f, 17f, 9f)
                moveTo(17f, 10.25f)
                curveTo(17.76f, 10.25f, 18.38f, 11.03f, 18.38f, 12f)
                curveTo(18.38f, 12.97f, 17.76f, 13.75f, 17f, 13.75f)
                curveTo(16.24f, 13.75f, 15.63f, 12.97f, 15.63f, 12f)
                curveTo(15.63f, 11.03f, 16.24f, 10.25f, 17f, 10.25f)
                close()
            }
        }.build()

        return _ProfessionalHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _ProfessionalHexagon: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PresentationPlay: ImageVector
    get() {
        if (_PresentationPlay != null) {
            return _PresentationPlay!!
        }
        _PresentationPlay = ImageVector.Builder(
            name = "PresentationPlay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3f)
                horizontalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 1f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 3f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                horizontalLineTo(15.25f)
                lineTo(17f, 22f)
                horizontalLineTo(15f)
                lineTo(13.25f, 16f)
                horizontalLineTo(10.75f)
                lineTo(9f, 22f)
                horizontalLineTo(7f)
                lineTo(8.75f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                moveTo(5f, 5f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                moveTo(11.85f, 11.85f)
                curveTo(11.76f, 11.94f, 11.64f, 12f, 11.5f, 12f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 11.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 7f)
                curveTo(11.64f, 7f, 11.76f, 7.06f, 11.85f, 7.15f)
                lineTo(13.25f, 8.54f)
                curveTo(13.57f, 8.86f, 13.89f, 9.18f, 13.89f, 9.5f)
                curveTo(13.89f, 9.82f, 13.57f, 10.14f, 13.25f, 10.46f)
                lineTo(11.85f, 11.85f)
                close()
            }
        }.build()

        return _PresentationPlay!!
    }

@Suppress("ObjectPropertyName")
private var _PresentationPlay: ImageVector? = null

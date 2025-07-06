package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ResistorNodes: ImageVector
    get() {
        if (_ResistorNodes != null) {
            return _ResistorNodes!!
        }
        _ResistorNodes = ImageVector.Builder(
            name = "ResistorNodes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 11f)
                horizontalLineTo(3.67f)
                curveTo(4.08f, 9.83f, 5.19f, 9f, 6.5f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 12f)
                curveTo(9.5f, 12.65f, 9.29f, 13.25f, 8.94f, 13.74f)
                lineTo(10.07f, 15.35f)
                lineTo(13.11f, 4f)
                lineTo(14.61f, 6.13f)
                lineTo(16.7f, 9.11f)
                lineTo(17.5f, 9f)
                curveTo(18.81f, 9f, 19.92f, 9.83f, 20.33f, 11f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(20.33f)
                curveTo(19.92f, 14.17f, 18.81f, 15f, 17.5f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 12f)
                curveTo(14.5f, 11.35f, 14.71f, 10.75f, 15.06f, 10.26f)
                lineTo(13.93f, 8.65f)
                lineTo(10.89f, 20f)
                lineTo(7.3f, 14.89f)
                curveTo(7.05f, 14.96f, 6.78f, 15f, 6.5f, 15f)
                curveTo(5.19f, 15f, 4.08f, 14.17f, 3.67f, 13f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                moveTo(17.5f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 10.5f)
                moveTo(6.5f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 10.5f)
                close()
            }
        }.build()

        return _ResistorNodes!!
    }

@Suppress("ObjectPropertyName")
private var _ResistorNodes: ImageVector? = null

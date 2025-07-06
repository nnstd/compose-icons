package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Timetable: ImageVector
    get() {
        if (_Timetable != null) {
            return _Timetable!!
        }
        _Timetable = ImageVector.Builder(
            name = "Timetable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 12f)
                horizontalLineTo(15.5f)
                verticalLineTo(14.82f)
                lineTo(17.94f, 16.23f)
                lineTo(17.19f, 17.53f)
                lineTo(14f, 15.69f)
                verticalLineTo(12f)
                moveTo(4f, 2f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 4f)
                verticalLineTo(10.1f)
                curveTo(21.24f, 11.36f, 22f, 13.09f, 22f, 15f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 22f)
                curveTo(13.09f, 22f, 11.36f, 21.24f, 10.1f, 20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 2f)
                moveTo(4f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(8.67f)
                curveTo(8.24f, 17.09f, 8f, 16.07f, 8f, 15f)
                horizontalLineTo(4f)
                moveTo(4f, 8f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                moveTo(18f, 8f)
                verticalLineTo(5f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                moveTo(4f, 13f)
                horizontalLineTo(8.29f)
                curveTo(8.63f, 11.85f, 9.26f, 10.82f, 10.1f, 10f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                moveTo(15f, 10.15f)
                arcTo(4.85f, 4.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.15f, 15f)
                curveTo(10.15f, 17.68f, 12.32f, 19.85f, 15f, 19.85f)
                arcTo(4.85f, 4.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.85f, 15f)
                curveTo(19.85f, 12.32f, 17.68f, 10.15f, 15f, 10.15f)
                close()
            }
        }.build()

        return _Timetable!!
    }

@Suppress("ObjectPropertyName")
private var _Timetable: ImageVector? = null

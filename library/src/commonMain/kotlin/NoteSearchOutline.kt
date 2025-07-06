package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NoteSearchOutline: ImageVector
    get() {
        if (_NoteSearchOutline != null) {
            return _NoteSearchOutline!!
        }
        _NoteSearchOutline = ImageVector.Builder(
            name = "NoteSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(10.82f)
                curveTo(3.6f, 10.24f, 4.28f, 9.8f, 5f, 9.5f)
                verticalLineTo(5f)
                horizontalLineTo(12f)
                verticalLineTo(10.82f)
                curveTo(12.03f, 10.85f, 12.07f, 10.87f, 12.1f, 10.9f)
                curveTo(12.44f, 11.24f, 12.73f, 11.61f, 12.97f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(12.97f)
                curveTo(12.73f, 19.39f, 12.44f, 19.76f, 12.1f, 20.1f)
                curveTo(11.74f, 20.45f, 11.35f, 20.74f, 10.94f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(9f)
                lineTo(15f, 3f)
                moveTo(14f, 10f)
                verticalLineTo(4.5f)
                lineTo(19.5f, 10f)
                horizontalLineTo(14f)
                moveTo(7.5f, 11f)
                curveTo(5f, 11f, 3f, 13f, 3f, 15.5f)
                curveTo(3f, 16.38f, 3.25f, 17.21f, 3.69f, 17.9f)
                lineTo(0.61f, 21f)
                lineTo(2f, 22.39f)
                lineTo(5.12f, 19.32f)
                curveTo(5.81f, 19.75f, 6.63f, 20f, 7.5f, 20f)
                curveTo(10f, 20f, 12f, 18f, 12f, 15.5f)
                reflectiveCurveTo(10f, 11f, 7.5f, 11f)
                moveTo(7.5f, 18f)
                curveTo(6.12f, 18f, 5f, 16.88f, 5f, 15.5f)
                reflectiveCurveTo(6.12f, 13f, 7.5f, 13f)
                reflectiveCurveTo(10f, 14.12f, 10f, 15.5f)
                reflectiveCurveTo(8.88f, 18f, 7.5f, 18f)
                close()
            }
        }.build()

        return _NoteSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _NoteSearchOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ProgressQuestion: ImageVector
    get() {
        if (_ProgressQuestion != null) {
            return _ProgressQuestion!!
        }
        _ProgressQuestion = ImageVector.Builder(
            name = "ProgressQuestion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                moveTo(13f, 15f)
                horizontalLineTo(11f)
                curveTo(11f, 11.75f, 14f, 12f, 14f, 10f)
                curveTo(14f, 8.9f, 13.1f, 8f, 12f, 8f)
                curveTo(10.9f, 8f, 10f, 8.9f, 10f, 10f)
                horizontalLineTo(8f)
                curveTo(8f, 7.79f, 9.79f, 6f, 12f, 6f)
                curveTo(14.21f, 6f, 16f, 7.79f, 16f, 10f)
                curveTo(16f, 12.5f, 13f, 12.75f, 13f, 15f)
                moveTo(22f, 12f)
                curveTo(22f, 17.18f, 18.05f, 21.45f, 13f, 21.95f)
                verticalLineTo(19.94f)
                curveTo(16.95f, 19.45f, 20f, 16.08f, 20f, 12f)
                curveTo(20f, 7.92f, 16.95f, 4.55f, 13f, 4.06f)
                verticalLineTo(2.05f)
                curveTo(18.05f, 2.55f, 22f, 6.82f, 22f, 12f)
                moveTo(11f, 2.05f)
                verticalLineTo(4.06f)
                curveTo(9.54f, 4.24f, 8.2f, 4.82f, 7.09f, 5.68f)
                lineTo(5.67f, 4.26f)
                curveTo(7.15f, 3.05f, 9f, 2.25f, 11f, 2.05f)
                moveTo(4.06f, 11f)
                horizontalLineTo(2.05f)
                curveTo(2.25f, 9f, 3.05f, 7.15f, 4.26f, 5.67f)
                lineTo(5.68f, 7.1f)
                curveTo(4.82f, 8.2f, 4.24f, 9.54f, 4.06f, 11f)
                moveTo(11f, 19.94f)
                verticalLineTo(21.95f)
                curveTo(9f, 21.75f, 7.15f, 20.96f, 5.67f, 19.74f)
                lineTo(7.09f, 18.32f)
                curveTo(8.2f, 19.18f, 9.54f, 19.76f, 11f, 19.94f)
                moveTo(2.05f, 13f)
                horizontalLineTo(4.06f)
                curveTo(4.24f, 14.46f, 4.82f, 15.8f, 5.68f, 16.91f)
                lineTo(4.26f, 18.33f)
                curveTo(3.05f, 16.85f, 2.25f, 15f, 2.05f, 13f)
                close()
            }
        }.build()

        return _ProgressQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _ProgressQuestion: ImageVector? = null

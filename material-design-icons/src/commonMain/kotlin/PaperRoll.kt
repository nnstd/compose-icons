package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PaperRoll: ImageVector
    get() {
        if (_PaperRoll != null) {
            return _PaperRoll!!
        }
        _PaperRoll = ImageVector.Builder(
            name = "PaperRoll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 3f)
                curveTo(5.69f, 3f, 3.14f, 5.69f, 3f, 9f)
                verticalLineTo(21f)
                horizontalLineTo(12f)
                verticalLineTo(13.46f)
                curveTo(13.1f, 14.45f, 14.5f, 15f, 16f, 15f)
                curveTo(19.31f, 15f, 22f, 12.31f, 22f, 9f)
                curveTo(22f, 5.69f, 19.31f, 3f, 16f, 3f)
                horizontalLineTo(9f)
                moveTo(16f, 5f)
                curveTo(18.21f, 5f, 20f, 6.79f, 20f, 9f)
                curveTo(20f, 11.21f, 18.21f, 13f, 16f, 13f)
                curveTo(13.79f, 13f, 12f, 11.21f, 12f, 9f)
                curveTo(12f, 6.79f, 13.79f, 5f, 16f, 5f)
                moveTo(16f, 7.25f)
                curveTo(15.03f, 7.25f, 14.25f, 8.03f, 14.25f, 9f)
                curveTo(14.25f, 9.97f, 15.03f, 10.75f, 16f, 10.75f)
                curveTo(16.97f, 10.75f, 17.75f, 9.97f, 17.75f, 9f)
                curveTo(17.75f, 8.03f, 16.97f, 7.25f, 16f, 7.25f)
                moveTo(4f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                moveTo(6f, 12f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                moveTo(8f, 12f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                moveTo(10f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _PaperRoll!!
    }

@Suppress("ObjectPropertyName")
private var _PaperRoll: ImageVector? = null

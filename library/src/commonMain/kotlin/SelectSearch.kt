package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SelectSearch: ImageVector
    get() {
        if (_SelectSearch != null) {
            return _SelectSearch!!
        }
        _SelectSearch = ImageVector.Builder(
            name = "SelectSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.31f, 18.9f)
                curveTo(19.75f, 18.21f, 20f, 17.38f, 20f, 16.5f)
                curveTo(20f, 14f, 18f, 12f, 15.5f, 12f)
                reflectiveCurveTo(11f, 14f, 11f, 16.5f)
                reflectiveCurveTo(13f, 21f, 15.5f, 21f)
                curveTo(16.37f, 21f, 17.19f, 20.75f, 17.88f, 20.32f)
                lineTo(21f, 23.39f)
                lineTo(22.39f, 22f)
                lineTo(19.31f, 18.9f)
                moveTo(15.5f, 19f)
                curveTo(14.12f, 19f, 13f, 17.88f, 13f, 16.5f)
                reflectiveCurveTo(14.12f, 14f, 15.5f, 14f)
                reflectiveCurveTo(18f, 15.12f, 18f, 16.5f)
                reflectiveCurveTo(16.88f, 19f, 15.5f, 19f)
                moveTo(21f, 9f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                moveTo(21f, 5f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                horizontalLineTo(20f)
                curveTo(20.55f, 3f, 21f, 3.45f, 21f, 4f)
                verticalLineTo(5f)
                moveTo(19f, 11.03f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(20.97f)
                curveTo(20.46f, 12.21f, 19.79f, 11.54f, 19f, 11.03f)
                moveTo(17f, 5f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                moveTo(13f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                moveTo(3f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                moveTo(7f, 19f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                moveTo(3f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                moveTo(4f, 3f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                curveTo(3f, 3.45f, 3.45f, 3f, 4f, 3f)
                moveTo(9f, 5f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                moveTo(3f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                curveTo(3.45f, 21f, 3f, 20.55f, 3f, 20f)
                verticalLineTo(19f)
                moveTo(3f, 15f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _SelectSearch!!
    }

@Suppress("ObjectPropertyName")
private var _SelectSearch: ImageVector? = null

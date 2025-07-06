package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ProjectorScreen: ImageVector
    get() {
        if (_ProjectorScreen != null) {
            return _ProjectorScreen!!
        }
        _ProjectorScreen = ImageVector.Builder(
            name = "ProjectorScreen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                verticalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(16.59f)
                lineTo(6.79f, 20.79f)
                lineTo(8.21f, 22.21f)
                lineTo(11f, 19.41f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(19.41f)
                lineTo(15.79f, 22.21f)
                lineTo(17.21f, 20.79f)
                lineTo(13f, 16.59f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 4f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 2f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _ProjectorScreen!!
    }

@Suppress("ObjectPropertyName")
private var _ProjectorScreen: ImageVector? = null

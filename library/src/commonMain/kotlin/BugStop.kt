package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BugStop: ImageVector
    get() {
        if (_BugStop != null) {
            return _BugStop!!
        }
        _BugStop = ImageVector.Builder(
            name = "BugStop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 7f)
                horizontalLineTo(16.19f)
                curveTo(15.74f, 6.2f, 15.12f, 5.5f, 14.37f, 5f)
                lineTo(16f, 3.41f)
                lineTo(14.59f, 2f)
                lineTo(12.42f, 4.17f)
                curveTo(11.96f, 4.06f, 11.5f, 4f, 11f, 4f)
                reflectiveCurveTo(10.05f, 4.06f, 9.59f, 4.17f)
                lineTo(7.41f, 2f)
                lineTo(6f, 3.41f)
                lineTo(7.62f, 5f)
                curveTo(6.87f, 5.5f, 6.26f, 6.21f, 5.81f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(5.09f)
                curveTo(5.03f, 9.33f, 5f, 9.66f, 5f, 10f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                curveTo(5f, 14.34f, 5.03f, 14.67f, 5.09f, 15f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                horizontalLineTo(5.81f)
                curveTo(7.26f, 19.5f, 10.28f, 20.61f, 13f, 19.65f)
                verticalLineTo(19f)
                curveTo(13f, 16.46f, 14.61f, 14.2f, 17f, 13.35f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                curveTo(17f, 9.66f, 16.97f, 9.33f, 16.91f, 9f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                moveTo(13f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                moveTo(13f, 11f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                moveTo(16f, 16f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _BugStop!!
    }

@Suppress("ObjectPropertyName")
private var _BugStop: ImageVector? = null

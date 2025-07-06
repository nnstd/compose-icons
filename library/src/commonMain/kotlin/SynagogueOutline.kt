package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SynagogueOutline: ImageVector
    get() {
        if (_SynagogueOutline != null) {
            return _SynagogueOutline!!
        }
        _SynagogueOutline = ImageVector.Builder(
            name = "SynagogueOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4f)
                curveTo(18.3f, 4f, 17f, 5.3f, 17f, 7f)
                verticalLineTo(7.3f)
                lineTo(12f, 3f)
                lineTo(7f, 7.3f)
                verticalLineTo(7f)
                curveTo(7f, 5.3f, 5.7f, 4f, 4f, 4f)
                reflectiveCurveTo(1f, 5.3f, 1f, 7f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                curveTo(11f, 15.4f, 11.4f, 15f, 12f, 15f)
                reflectiveCurveTo(13f, 15.4f, 13f, 16f)
                verticalLineTo(21f)
                horizontalLineTo(23f)
                verticalLineTo(7f)
                curveTo(23f, 5.3f, 21.7f, 4f, 20f, 4f)
                moveTo(20f, 6f)
                curveTo(20.5f, 6f, 21f, 6.4f, 21f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                curveTo(19f, 6.4f, 19.5f, 6f, 20f, 6f)
                moveTo(4f, 6f)
                curveTo(4.6f, 6f, 5f, 6.4f, 5f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                curveTo(3f, 6.4f, 3.5f, 6f, 4f, 6f)
                moveTo(3f, 19f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                moveTo(17f, 19f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                curveTo(15f, 14.4f, 13.6f, 13f, 12f, 13f)
                reflectiveCurveTo(9f, 14.4f, 9f, 16f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(9.9f)
                lineTo(12f, 5.6f)
                lineTo(17f, 9.9f)
                verticalLineTo(19f)
                moveTo(19f, 19f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                moveTo(12f, 8.5f)
                curveTo(12.8f, 8.5f, 13.5f, 9.2f, 13.5f, 10f)
                reflectiveCurveTo(12.8f, 11.5f, 12f, 11.5f)
                reflectiveCurveTo(10.5f, 10.8f, 10.5f, 10f)
                reflectiveCurveTo(11.2f, 8.5f, 12f, 8.5f)
                close()
            }
        }.build()

        return _SynagogueOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SynagogueOutline: ImageVector? = null

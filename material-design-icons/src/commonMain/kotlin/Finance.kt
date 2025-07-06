package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Finance: ImageVector
    get() {
        if (_Finance != null) {
            return _Finance!!
        }
        _Finance = ImageVector.Builder(
            name = "Finance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 16.5f)
                lineTo(3f, 19.44f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                moveTo(11f, 14.66f)
                lineTo(9.43f, 13.32f)
                lineTo(8f, 14.64f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                moveTo(16f, 13f)
                lineTo(13f, 16f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                moveTo(18.81f, 12.81f)
                lineTo(17f, 11f)
                horizontalLineTo(22f)
                verticalLineTo(16f)
                lineTo(20.21f, 14.21f)
                lineTo(13f, 21.36f)
                lineTo(9.53f, 18.34f)
                lineTo(5.75f, 22f)
                horizontalLineTo(3f)
                lineTo(9.47f, 15.66f)
                lineTo(13f, 18.64f)
            }
        }.build()

        return _Finance!!
    }

@Suppress("ObjectPropertyName")
private var _Finance: ImageVector? = null

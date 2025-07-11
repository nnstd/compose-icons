package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Meteor: ImageVector
    get() {
        if (_Meteor != null) {
            return _Meteor!!
        }
        _Meteor = ImageVector.Builder(
            name = "Meteor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.8f, 3f)
                lineTo(19.67f, 18.82f)
                curveTo(19.67f, 18.82f, 20f, 19.27f, 19.58f, 19.71f)
                curveTo(19.17f, 20.15f, 18.63f, 19.77f, 18.63f, 19.77f)
                lineTo(2.8f, 3f)
                moveTo(7.81f, 4.59f)
                lineTo(20.91f, 16.64f)
                curveTo(20.91f, 16.64f, 21.23f, 17.08f, 20.82f, 17.5f)
                curveTo(20.4f, 17.97f, 19.86f, 17.59f, 19.86f, 17.59f)
                lineTo(7.81f, 4.59f)
                moveTo(4.29f, 8f)
                lineTo(17.39f, 20.03f)
                curveTo(17.39f, 20.03f, 17.71f, 20.47f, 17.3f, 20.91f)
                curveTo(16.88f, 21.36f, 16.34f, 21f, 16.34f, 21f)
                lineTo(4.29f, 8f)
                moveTo(12.05f, 5.96f)
                lineTo(21.2f, 14.37f)
                curveTo(21.2f, 14.37f, 21.42f, 14.68f, 21.13f, 15f)
                curveTo(20.85f, 15.3f, 20.47f, 15.03f, 20.47f, 15.03f)
                lineTo(12.05f, 5.96f)
                moveTo(5.45f, 11.91f)
                lineTo(14.6f, 20.33f)
                curveTo(14.6f, 20.33f, 14.82f, 20.64f, 14.54f, 20.95f)
                curveTo(14.25f, 21.26f, 13.87f, 21f, 13.87f, 21f)
                lineTo(5.45f, 11.91f)
                moveTo(16.38f, 7.92f)
                lineTo(20.55f, 11.74f)
                curveTo(20.55f, 11.74f, 20.66f, 11.88f, 20.5f, 12.03f)
                curveTo(20.38f, 12.17f, 20.19f, 12.05f, 20.19f, 12.05f)
                lineTo(16.38f, 7.92f)
                moveTo(7.56f, 16.1f)
                lineTo(11.74f, 19.91f)
                curveTo(11.74f, 19.91f, 11.85f, 20.06f, 11.7f, 20.2f)
                curveTo(11.56f, 20.35f, 11.37f, 20.22f, 11.37f, 20.22f)
                lineTo(7.56f, 16.1f)
                close()
            }
        }.build()

        return _Meteor!!
    }

@Suppress("ObjectPropertyName")
private var _Meteor: ImageVector? = null
